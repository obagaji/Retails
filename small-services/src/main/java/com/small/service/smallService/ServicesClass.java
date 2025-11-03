package com.small.service.smallService;

import com.small.service.entity.SmallEntity;
import com.small.service.smallRepo.SmallReposit;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class ServicesClass {

    @Autowired
    private SmallReposit smallReposit;

    @Autowired
    private SmallEntity small;

    public SmallEntity saveEntity(SmallEntity entity)
    {
        return smallReposit.save(entity);
    }

    public List<SmallEntity> getSavedEntity()
    {
        return smallReposit.findAll();
    }

}
