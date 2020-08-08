package zor.edu.demo.dao.cafedra.interfaces;

import zor.edu.demo.model.Cafedra;

import java.util.List;

public interface IDaoCafedra
{
    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra update(Cafedra cafedra);
    Cafedra delete(String id);
    List<Cafedra> getAll();
}
