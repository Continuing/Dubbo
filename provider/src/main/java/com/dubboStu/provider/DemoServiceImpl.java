package com.dubboStu.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubboStu.api.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("rpc ip:"+ RpcContext.getContext().getRemoteAddressString());
        return name;
    }
}
