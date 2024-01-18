/*
 * Esta es una clase abstracta que no puede ser instanciada directamente,
 * pero puede tener métodos abstractos y campos que son compartidos por sus subclases.
 */
public abstract class Player {
    // protected permite que las subclases accedan a este atributo.
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    //cada tipo de jugador (humano o computadora) realice una suposición en el juego
    public abstract int guessNumber();
}