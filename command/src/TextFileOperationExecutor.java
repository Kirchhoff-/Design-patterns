import java.util.ArrayList;
import java.util.List;

public final class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations;

    public TextFileOperationExecutor() {
        textFileOperations = new ArrayList<>();
    }

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
