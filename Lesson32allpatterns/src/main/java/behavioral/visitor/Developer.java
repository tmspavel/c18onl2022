package behavioral.visitor;

public interface Developer {

    void create(behavioral.visitor.ProjectClass projectClass);

    void create(Database database);

    void create(behavioral.visitor.Test test);
}
