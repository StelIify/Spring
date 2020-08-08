package zor.edu.demo.service.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zor.edu.demo.dao.cafedra.impls.DaoCafedraImpl;
import zor.edu.demo.model.Cafedra;
import zor.edu.demo.repository.CafedraRepository;
import zor.edu.demo.service.cafedra.interfaces.ICafedralService;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service

public class CafedralServiceImpl implements ICafedralService
{
//        @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    CafedraRepository cafedraRepository;


    @Override
    public Cafedra create(Cafedra cafedra)
    {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id)
    {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra update(Cafedra cafedra)
    {
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra delete(String id)
    {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public List<Cafedra> getAll()
    {
        return cafedraRepository.findAll();
    }
}
