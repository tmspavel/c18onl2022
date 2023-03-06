package by.home.behavioral.visitor;

public interface Developer {

    void create(by.home.behavioral.visitor.ProjectClass projectClass);

    void create(Database database);

    void create(by.home.behavioral.visitor.Test test);
}
