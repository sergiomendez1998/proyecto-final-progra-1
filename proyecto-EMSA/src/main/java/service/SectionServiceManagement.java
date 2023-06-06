package service;

import interfaces.CrudInterface;
import repositories.SectionRepository;

import java.util.List;

public class SectionServiceManagement implements CrudInterface {
    SectionRepository sectionRepository = new SectionRepository();

    @Override
    public void executeCreate(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<?> executeReadAll() {
        return sectionRepository.getAllSections();
    }

    @Override
    public void executeUpdate(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void executeDelete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void executeRead(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
