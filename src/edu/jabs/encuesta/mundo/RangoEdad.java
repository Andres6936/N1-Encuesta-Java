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
package edu.jabs.encuesta.mundo;

/**
 * Clase que representa un rango de edad para la encuesta.
 */
public class RangoEdad
{

    // -----------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------

    /**
     * Cantidad de opiniones hechas por gente soltera en este rango de edad.
     */
    private int numeroDeSolteros;

    /**
     * Cantidad de opiniones hechas por gente casada en este rango de edad.
     */
    private int numeroDeCasados;

    /**
     * Suma de las opiniones hechas por gente soltera en este rango de edad.
     */
    private int totalOpinionSolteros;

    /**
     * Suma de las opiniones hechas por gente casada en este rango de edad.
     */
    private int totalOpinionCasados;

    /**
     * Edad m�nima para este rango de la poblaci�n.
     */
    private int edadMinima;

    /**
     * Edad m�xima para este rango de la poblaci�n.
     */
    private int edadMaxima;

    // -----------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------

    /**
     * Construye el rango de encuestas. <br>
     * <b>post: </b> La edad m�nima y edad m�xima fueron inicializadas con los valores dados por par�metro. <br>
     * El n�mero de casados, n�mero de solteros, el total de opiniones de solteros y el total de opiniones de casados fueron inicializados en 0.
     * @param pEdadMinima Edad m�nima para este rango de la poblaci�n. pEdadMinima > 0.
     * @param pEdadMaxima Edad m�xima para este rango de la poblaci�n. pEdadMaxima > 0 && pEdadMaxima > pEdadMinima.
     */
    public RangoEdad( int pEdadMinima, int pEdadMaxima )
    {
        numeroDeCasados = 0;
        numeroDeSolteros = 0;
        totalOpinionSolteros = 0;
        totalOpinionCasados = 0;
        edadMinima = pEdadMinima;
        edadMaxima = pEdadMaxima;
    }

    /**
     * Retorna el promedio de la encuesta en el rango de edad. <br>
     * @return Promedio de la encuesta en el rango de edad.
     */
    public double darPromedio( )
    {
        return ( double )darTotalOpiniones( ) / darNumeroOpiniones( );
    }

    /**
     * Retorna la edad m�nima de este rango de edad.
     * @return Edad m�nima de este rango de edad.
     */
    public int darEdadMinima( )
    {
        return edadMinima;
    }

    /**
     * Retorna la edad m�xima para este rango de edad.
     * @return Edad m�xima para este rango de edad.
     */
    public int darEdadMaxima( )
    {
        return edadMaxima;
    }

    /**
     * Retorna el promedio de las opiniones de la gente casada en este rango de edad.
     * @return Promedio de opini�n del curso en la encuesta en este rango de edad de la clase considerando s�lo los casados.
     */
    public double darPromedioCasados( )
    {
        return ( double )totalOpinionCasados / numeroDeCasados;
    }

    /**
     * Retorna el promedio de las opiniones de la gente soltera en este rango.
     * @return Promedio de opini�n del curso en la encuesta en el rango de edad de la clase considerando s�lo los solteros.
     */
    public double darPromedioSolteros( )
    {
        return ( double )totalOpinionSolteros / numeroDeSolteros;
    }

    /**
     * Retorna el n�mero de opiniones hechas para este rango.
     * @return Cantidad total de opiniones.
     */
    public int darNumeroOpiniones( )
    {
        return numeroDeCasados + numeroDeSolteros;
    }

    /**
     * Retorna la suma de opiniones hechas para este rango.
     * @return Total de opiniones del curso.
     */
    public int darTotalOpiniones( )
    {
        return totalOpinionCasados + totalOpinionSolteros;
    }

    /**
     * Retorna el n�mero de personas casadas que respondieron la encuesta en este rango de edad.
     * @return N�mero de personas casadas que respondieron la encuesta.
     */
    public int darNumeroCasados( )
    {
        return numeroDeCasados;
    }

    /**
     * Retorna el n�mero de personas solteras que respondieron la encuesta en este rango de edad.
     * @return N�mero de personas solteras que respondieron la encuesta en este rango de edad.
     */
    public int darNumeroSolteros( )
    {
        return numeroDeSolteros;
    }

    /**
     * Retorna el n�mero total de opiniones de los encuestados casados en este rango de edad.
     * @return N�mero total de opiniones de los encuestados casados en este rango de edad.
     */
    public int darTotalOpinionCasados( )
    {
        return totalOpinionCasados;
    }

    /**
     * Retorna el n�mero total de opiniones de los encuestados solteros en este rango de edad.
     * @return N�mero total de opiniones de los encuestados solteros en este rango de edad.
     */
    public int darTotalOpinionSolteros( )
    {
        return totalOpinionSolteros;
    }

    /**
     * Retorna una cadena de texto con la edad m�nima y edad m�xima.
     * @return Cadena de car�cteres con el rango de edades para este grupo.
     */
    public String darRangoDeEdad( )
    {
        return edadMinima + "-" + ( edadMaxima - 1 );
    }

    /**
     * Agrega una opini�n de una persona soltera para este rango de edad. <br>
     * <b>post: </b> Se agreg� una nueva opini�n.
     * @param pOpinion Opinion del encuestado. pOpinion >= 0 && pOpinion < 11.
     */
    public void agregarOpinionSoltero( int pOpinion )
    {
        numeroDeSolteros = numeroDeSolteros + 1;
        totalOpinionSolteros = totalOpinionSolteros + pOpinion;
    }

    /**
     * Agrega una opini�n de una persona casada para este rango de la poblaci�n. <br>
     * <b>post: </b> Se agreg� una nueva opini�n.
     * @param pOpinion Opinion del encuestado. pOpinion >= 0 && pOpinion < 11.
     */
    public void agregarOpinionCasado( int pOpinion )
    {
        numeroDeCasados = numeroDeCasados + 1;
        totalOpinionCasados = totalOpinionCasados + pOpinion;
    }

}
