package com.example.crud_sprint_boot.sinterface;

import com.example.crud_sprint_boot.model.Empleado;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CrudEmpleadoInterface {

    @GET("/consultarAll")
    Call<List<Empleado>> getAll();

    @POST("/guardar")
    Call<Empleado> crearEmpleado(@Body Empleado empleado);

    @PUT("/update/{id}")
    Call<Empleado>update_empleado(@Path("id")long id, @Body Empleado empleado);

    @DELETE("/user/{id}")
    Call<Empleado>deleteEmpleado(@Path("id")long id);

}
