package com.ezana.api;

import com.ezana.connector.ConnectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/connector")
public class ConnectorController {

    private final ConnectorService connectorService;

    @Autowired
    ConnectorController(@Qualifier("DefaultConnectorServiceImpl")ConnectorService connectorService){
        this.connectorService = connectorService;
    }

    @GetMapping("/")
    public boolean create(){
        connectorService.create();
        return true;
    }

}
