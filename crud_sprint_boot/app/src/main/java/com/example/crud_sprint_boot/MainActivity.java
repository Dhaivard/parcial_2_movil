package com.example.crud_sprint_boot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//import android.view.Window;

import com.example.crud_sprint_boot.model.Empleado;
import com.example.crud_sprint_boot.sinterface.CrudEmpleadoInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{
List<Empleado> lisEmpleado;
CrudEmpleadoInterface cruempleado;
Empleado empleadoGuardado, empleadoEjemplo,updatedEmpleado;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //read
       // getAll();
        //create
        empleadoEjemplo = new Empleado();
        empleadoEjemplo.setEmail("dato nuevo email act");
        empleadoEjemplo.setNombre("dato nuevo nombre act");
        empleadoEjemplo.setPassword("dato nuevo password act");
        //crear(empleadoEjemplo);
        //delete(3);
        update_empleado(2L,empleadoEjemplo);
/*
        empleadoactualizar = new Empleado();
        long id=1;
        empleadoactualizar.setId(id);
        empleadoactualizar.setEmail("actualizado");
        empleadoactualizar.setNombre("actualizado");
        empleadoactualizar.setPassword("actualizado");
        update_empleado(id);
*/
    }

    private void getAll(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.101.108:8081")
                .addConverterFactory(GsonConverterFactory.create()).build();

        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call =cruempleado.getAll();

        call.enqueue(new Callback<List<Empleado>>(){
            @Override
            public void onResponse(Call <List<Empleado>> call, Response<List<Empleado>> response){
                if(!response.isSuccessful()){
                    Log.e("Response err:,",response.message());
                    return;
                }
                lisEmpleado =response.body();
                //
                lisEmpleado.forEach(p->Log.i("Empleados: ",p.toString()));
            }
            @Override
            public void onFailure(Call <List<Empleado>> call,Throwable t){
                Log.e("Throw error:",t.getMessage());
            }
        });
    }

    private void crear(Empleado empleado){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.101.108:8081")
                .addConverterFactory(GsonConverterFactory.create()).build();

        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<Empleado> call =cruempleado.crearEmpleado(empleado);

        call.enqueue(new Callback<Empleado>(){
            @Override
            public void onResponse(Call <Empleado> call, Response<Empleado> response){
                if(!response.isSuccessful()){
                    Log.e("Response err:,",response.message());
                    return;
                }
                empleadoGuardado =response.body();
                empleadoGuardado.toString();
            }
            @Override
            public void onFailure(Call <Empleado> call,Throwable t){
                Log.e("Throw error:",t.getMessage());
            }
        });


    }

    private void update_empleado(long id, Empleado empleado) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.101.108:8081")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<Empleado> call = cruempleado.update_empleado(id, empleado);

        call.enqueue(new Callback<Empleado>() {
            @Override
            public void onResponse(Call<Empleado> call, Response<Empleado> response) {
                if (!response.isSuccessful()) {
                    Log.e("Update Empleado Error", response.message());
                    return;
                }

                updatedEmpleado = response.body();
                if (updatedEmpleado != null) {
                    Log.d("Empleado Actualizado", updatedEmpleado.toString());
                } else {
                    Log.e("Update Empleado Error", "La respuesta fue nula");
                }
            }

            @Override
            public void onFailure(Call<Empleado> call, Throwable t) {
                Log.e("Update Empleado Error", t.getMessage());
            }
        });
    }

    private void delete(long id ){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.101.108:8081")
                .addConverterFactory(GsonConverterFactory.create()).build();

        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<Empleado> call =cruempleado.deleteEmpleado(id);

        call.enqueue(new Callback<Empleado>(){
            @Override
            public void onResponse(Call <Empleado> call, Response<Empleado> response){
                if(!response.isSuccessful()){
                    Log.e("Response err:,",response.message());
                    return;
                }
            }
            @Override
            public void onFailure(Call <Empleado> call,Throwable t){
                Log.e("Throw error:",t.getMessage());
            }
        });
    }




}