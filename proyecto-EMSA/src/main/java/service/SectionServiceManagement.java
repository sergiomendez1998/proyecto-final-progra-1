package service;

import interfaces.CrudInterface;
import repositories.SectionRepository;

import java.util.List;

public class SectionServiceManagement implements CrudInterface {
    SectionRepository section = new SectionRepository();

    @Override
    public void create(Object object) {

    }

    @Override
    public List<?> read() {
        return section.getAllSections();
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(int id) {

    }
}
