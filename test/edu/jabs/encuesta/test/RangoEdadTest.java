/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_encuesta
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package edu.jabs.encuesta.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.jabs.encuesta.mundo.RangoEdad;

/**
 * Clase usada para verificar que los m�todos de la clase RangoEdad est�n correctamente implementados.
 */
public class RangoEdadTest
{

    // -----------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------

    /**
     * Rango de prueba para la encuesta.
     */
    private RangoEdad rangoEncuesta1;

    /**
     * Rango de prueba para la encuesta.
     */
    private RangoEdad rangoEncuesta2;

    // -----------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------

    /**
     * Escenario 1: Crea un escenario de prueba con dos rangos.
     */
    private void setupEscenario1( )
    {
        rangoEncuesta1 = new RangoEdad( 0, 18 );
        rangoEncuesta2 = new RangoEdad( 18, 55 );
    }

    /**
     * Escenario 2: Crea un escenario de prueba con dos rangos con opiniones de soltero.
     */
    private void setupEscenario2( )
    {
        rangoEncuesta1 = new RangoEdad( 0, 18 );
        rangoEncuesta2 = new RangoEdad( 18, 55 );

        rangoEncuesta1.agregarOpinionSoltero( 5 );
        rangoEncuesta1.agregarOpinionSoltero( 1 );
        rangoEncuesta1.agregarOpinionSoltero( 9 );
        rangoEncuesta2.agregarOpinionSoltero( 0 );
        rangoEncuesta2.agregarOpinionSoltero( 8 );
    }

    /**
     * Escenario 3: Crea un escenario de prueba con dos rangos con opiniones de casado.
     */
    private void setupEscenario3( )
    {
        rangoEncuesta1 = new RangoEdad( 0, 18 );
        rangoEncuesta2 = new RangoEdad( 18, 55 );
        rangoEncuesta1.agregarOpinionCasado( 10 );
        rangoEncuesta1.agregarOpinionCasado( 5 );
        rangoEncuesta1.agregarOpinionCasado( 1 );
        rangoEncuesta1.agregarOpinionCasado( 7 );
        rangoEncuesta2.agregarOpinionCasado( 6 );
        rangoEncuesta2.agregarOpinionCasado( 6 );
        rangoEncuesta2.agregarOpinionCasado( 9 );
        rangoEncuesta2.agregarOpinionCasado( 2 );
        rangoEncuesta2.agregarOpinionCasado( 2 );
        rangoEncuesta2.agregarOpinionCasado( 1 );
    }

    /**
     * Escenario 4: Crea un escenario de prueba con dos rangos con opiniones.
     */
    private void setupEscenario4( )
    {
        rangoEncuesta1 = new RangoEdad( 0, 18 );
        rangoEncuesta2 = new RangoEdad( 18, 55 );
        rangoEncuesta1.agregarOpinionCasado( 10 );
        rangoEncuesta1.agregarOpinionCasado( 5 );
        rangoEncuesta1.agregarOpinionCasado( 1 );
        rangoEncuesta1.agregarOpinionCasado( 7 );
        rangoEncuesta1.agregarOpinionSoltero( 8 );
        rangoEncuesta1.agregarOpinionSoltero( 4 );
        rangoEncuesta1.agregarOpinionSoltero( 4 );
        rangoEncuesta1.agregarOpinionSoltero( 6 );

        rangoEncuesta2.agregarOpinionCasado( 8 );
        rangoEncuesta2.agregarOpinionCasado( 2 );
        rangoEncuesta2.agregarOpinionCasado( 0 );
        rangoEncuesta2.agregarOpinionCasado( 8 );
        rangoEncuesta2.agregarOpinionSoltero( 9 );
        rangoEncuesta2.agregarOpinionSoltero( 5 );
        rangoEncuesta2.agregarOpinionSoltero( 3 );
        rangoEncuesta2.agregarOpinionSoltero( 7 );
        rangoEncuesta2.agregarOpinionSoltero( 7 );

    }

    /**
     * Prueba 1: M�todo que se encarga de verificar el m�todo agregarOpinionSoltero.<br>
     * <b> M�todos a probar: </b> <br>
     * agregarOpinionSoltero<br>
     * darNumeroOpiniones<br>
     * darTotalOpiniones<br>
     * darTotalOpinionCasados<br>
     * darTotalOpinionSolteros<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Se agregan varias opiniones a los rangos.
     */
    @Test
    public void testAgregarOpinionSoltero( )
    {
        setupEscenario1( );
        rangoEncuesta1.agregarOpinionSoltero( 5 );
        rangoEncuesta1.agregarOpinionSoltero( 1 );
        rangoEncuesta1.agregarOpinionSoltero( 9 );
        rangoEncuesta2.agregarOpinionSoltero( 0 );
        rangoEncuesta2.agregarOpinionSoltero( 8 );

        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 3, rangoEncuesta1.darNumeroOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 15, rangoEncuesta1.darTotalOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 2, rangoEncuesta2.darNumeroOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 2, rangoEncuesta2.darNumeroSolteros( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 0, rangoEncuesta2.darNumeroCasados( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 8, rangoEncuesta2.darTotalOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 0, rangoEncuesta2.darTotalOpinionCasados( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 8, rangoEncuesta2.darTotalOpinionSolteros( ) );

    }

    /**
     * Prueba 2: M�todo que se encarga de verificar el m�todo agregarOpinionCasado.<br>
     * <b> M�todos a probar: </b> <br>
     * agregarOpinionCasado<br>
     * darNumeroOpiniones<br>
     * darTotalOpiniones<br>
     * darTotalOpinionCasados<br>
     * darTotalOpinionSolteros<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Se agregan varias opiniones a los rangos.
     */
    @Test
    public void testAgregarOpinionCasado( )
    {
        setupEscenario1( );
        rangoEncuesta1.agregarOpinionCasado( 10 );
        rangoEncuesta1.agregarOpinionCasado( 5 );
        rangoEncuesta1.agregarOpinionCasado( 1 );
        rangoEncuesta1.agregarOpinionCasado( 8 );
        rangoEncuesta2.agregarOpinionCasado( 6 );
        rangoEncuesta2.agregarOpinionCasado( 6 );
        rangoEncuesta2.agregarOpinionCasado( 9 );
        rangoEncuesta2.agregarOpinionCasado( 2 );
        rangoEncuesta2.agregarOpinionCasado( 2 );
        rangoEncuesta2.agregarOpinionCasado( 5 );

        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 4, rangoEncuesta1.darNumeroOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 24, rangoEncuesta1.darTotalOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 6, rangoEncuesta2.darNumeroOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 6, rangoEncuesta2.darNumeroCasados( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 0, rangoEncuesta2.darNumeroSolteros( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 30, rangoEncuesta2.darTotalOpiniones( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 30, rangoEncuesta2.darTotalOpinionCasados( ) );
        assertEquals( "No se puede agregar las opiniones correctamente a un rango", 0, rangoEncuesta2.darTotalOpinionSolteros( ) );

    }

    /**
     * Prueba 3: M�todo que se encarga de verificar el m�todo darPromedioSolteros.<br>
     * <b> M�todos a probar: </b> <br>
     * darPromedioSolteros<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Se agregan varias opiniones a los rangos.
     */
    @Test
    public void testDarPromedioSolteros( )
    {
        setupEscenario2( );
        assertEquals( "No se est� calculando el promedio correctamente", 5d, rangoEncuesta1.darPromedioSolteros( ), 5d );
        assertEquals( "No se est� calculando el promedio correctamente", 4d, rangoEncuesta2.darPromedioSolteros( ), 4d );
    }

    /**
     * Prueba 4: M�todo que se encarga de verificar el m�todo darPromedioCasados.<br>
     * <b> M�todos a probar: </b> <br>
     * darPromedioCasados<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Se agregan varias opiniones a los rangos.
     */
    @Test
    public void testDarPromedioCasados( )
    {
        setupEscenario3( );
        assertEquals( "No se est� calculando el promedio correctamente", 6d, rangoEncuesta1.darPromedioCasados( ), 5d );
        assertEquals( "No se est� calculando el promedio correctamente", 5d, rangoEncuesta2.darPromedioCasados( ), 4d );
    }

    /**
     * Prueba 5: M�todo que se encarga de verificar el m�todo darPromedio.<br>
     * <b> M�todos a probar: </b> <br>
     * darPromedio<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Se agregan varias opiniones a los rangos.
     */
    @Test
    public void testDarPromedio( )
    {
        setupEscenario4( );
        assertEquals( "No se est� calculando el promedio correctamente", 5.625, rangoEncuesta1.darPromedio( ), 2d );
        assertEquals( "No se est� calculando el promedio correctamente", 5.44, rangoEncuesta2.darPromedio( ), 2d );
    }
}
