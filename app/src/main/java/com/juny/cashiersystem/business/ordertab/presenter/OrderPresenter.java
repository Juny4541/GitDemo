package com.juny.cashiersystem.business.ordertab.presenter;

import com.juny.cashiersystem.base.BasePresenter;
import com.juny.cashiersystem.bean.OrderBean;
import com.juny.cashiersystem.business.ordertab.contract.IOrderContract;
import com.juny.cashiersystem.business.ordertab.model.OrderRepository;

/**
 * <br> ClassName: OrderPresenter
 * <br> Description:
 * <br>
 * <br> Author:  chenrunfang
 * <br> Date:  2018/4/10 9:46
 */

public class OrderPresenter extends BasePresenter<IOrderContract.IView>
        implements IOrderContract.IPresenter {
    private OrderRepository mOrderRepository;

    public OrderPresenter() {
        mOrderRepository = new OrderRepository();
    }

    @Override
    public void getOrderDatas() {
        if (isViewAttached()) {
            getView().showOrderDatas(mOrderRepository.searchOrderData());
        }
    }

    @Override
    public OrderBean updateOrder(int orderId, String isSelect) {
        return mOrderRepository.updateOrder(orderId, isSelect);
    }

    public void closeRealm() {
        mOrderRepository.closeRealm();
    }

}
