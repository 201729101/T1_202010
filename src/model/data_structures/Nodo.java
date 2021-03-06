package model.data_structures;

/**
 * Clase del nodo de una lista encadaneda
 */
public class Nodo<E extends Comparable<E>> 
{
	/**
	 * Referencia al siguiente nodo
	 */
	private Nodo<E> siguiente;
	
	/**
	 * Elelemtno generico contenido en el nodo
	 */
	private E elemento;
	
	/**
	 * Constructor con un elemento pasado por parametro
	 * @param pElelemtno elemento a a�adir en el nodo
	 */
	public Nodo(E pElelemtno)
	{
		siguiente = null;
		elemento = pElelemtno;
	}
	
	/**
	 * Retorna el elemento del nodo
	 * @return elemento del nodo
	 */
	public E darElemento()
	{
		return elemento;
	}

	/**
	 * Retorna el siguiente nodo
	 * @return siguiente nodo
	 */
	public Nodo<E> darSiguiente()
	{
		return siguiente;
	}
	
	/**
	 * Cambia el siguiento nodo por uno recibido por par�metro
	 * @param pSiguiente nuevo siguiente nodo
	 */
	public void cambiarSiguiente(Nodo<E> pSiguiente)
	{
		siguiente = pSiguiente;
	}
}
