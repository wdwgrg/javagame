package repository;

import model.Model;

public class RepositoryImpl implements Repository{
    private static Model[] modelList = new Model[5];
    private static int count = 0;

    @Override
    public void addModel(Model m) {
        modelList[count] = m;
        count++;
    }

    @Override
    public Model getModel(int idx) {
        return modelList[idx];
    }
}
