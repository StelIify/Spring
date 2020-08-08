package zor.edu.demo.service.cafedra.interfaces;

import zor.edu.demo.model.Cafedra;

import java.util.List;

public interface ICafedralService
{
    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra update(Cafedra cafedra);
    Cafedra delete(String id);
    List<Cafedra> getAll();
}
