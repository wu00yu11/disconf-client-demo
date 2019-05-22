package com.learn.example.disconf;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.beans.factory.annotation.Value;

@DisconfFile(filename = "login.properties")
public class Demo implements Idemo{
    @Value("11")
    private String gateSwitch;

    @DisconfFileItem(name = "gate.switch", associateField = "gateSwitch")
    public String getGateSwitch() {
        return gateSwitch;
    }

    public void setGateSwitch(String gateSwitch) {
        this.gateSwitch = gateSwitch;
    }

    public String getName() {
        System.out.println("进来getName方法");
        return gateSwitch;
    }
}
