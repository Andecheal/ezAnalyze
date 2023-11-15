package com.ezana.connector;

import org.springframework.stereotype.Service;

/**
 * @version 0.0.1
 * @descreption: TODO
 * @author: Andecheal
 * @date 2023/11/15 23:44
 **/
@Service("DefaultConnectorServiceImpl")
public class DefaultConnectorServiceImpl implements ConnectorService {

    @Override
    public void create() {
        System.out.println("helloWorld");
    }
}
