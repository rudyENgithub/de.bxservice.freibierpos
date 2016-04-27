package de.bxservice.bxpos.logic.daomanager;

import android.content.Context;

import java.io.Serializable;
import java.util.List;

import de.bxservice.bxpos.logic.model.idempiere.TableGroup;
import de.bxservice.bxpos.persistence.DataMapper;

/**
 * Created by Diego Ruiz on 28/12/15.
 */
public class PosTableGroupManagement implements ObjectManagement, Serializable {

    //Object that writes to the db
    private DataMapper dataMapper;

    public PosTableGroupManagement(Context ctx) {
        dataMapper = new DataMapper(ctx);
    }

    @Override
    public boolean update(Object object) {
        return dataMapper.update(object);
    }

    @Override
    public boolean create(Object object) {
        return dataMapper.save(object);
    }

    @Override
    public TableGroup get(long id){
        return dataMapper.getTableGroup(id);
    }

    @Override
    public boolean remove(Object object) {
        return true;
    }

    public long getTotalTableGroups() {
        return dataMapper.getTotalTableGroups();
    }

    public List<TableGroup> getAllTableGroups() {
        return dataMapper.getAllTableGroups();
    }
}
