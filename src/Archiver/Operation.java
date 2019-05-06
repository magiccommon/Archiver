package Archiver;

public enum Operation {
    CREATE("create new archive"),
    ADD("add file to the existing archive"),
    REMOVE("delete file from the archive"),
    EXTRACT("extract all from the archive"),
    CONTENT("view the contents of the archive"),
    EXIT("exit");

    private String comment;

    Operation(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return comment;
    }
}
