package dio.me.boardtarefas.exception;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(final String message) {
        super(message);
    }
}
