package repository;

import model.Model;

public interface Repository {

    public abstract void addModel(Model m);
    public abstract Model getModel(int idx);
}
