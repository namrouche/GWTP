package com.gwtplatform.carstore.server.dispatch;

import javax.inject.Inject;
import javax.inject.Provider;

import com.gwtplatform.carstore.server.dao.ManufacturerDao;
import com.gwtplatform.carstore.shared.dispatch.DeleteManufacturerAction;
import com.gwtplatform.carstore.shared.dispatch.NoResults;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class DeleteManufacturerHandler extends AbstractActionHandler<DeleteManufacturerAction, NoResults> {
    private final Provider<ManufacturerDao> manufacturerDaoProvider;

    @Inject
    public DeleteManufacturerHandler(final Provider<ManufacturerDao> manufacturerDaoProvider) {
        super(DeleteManufacturerAction.class);

        this.manufacturerDaoProvider = manufacturerDaoProvider;
    }

    @Override
    public NoResults execute(DeleteManufacturerAction action, ExecutionContext context) throws ActionException {
        manufacturerDaoProvider.get().delete(action.getManufacturer().getId());

        return new NoResults();
    }
}
