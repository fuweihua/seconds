package com.zk.sample.provider.impl;

import com.zk.sample.dto.User;
import com.zk.sample.provider.SampleService;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
@Path("/sampleService")
@Service("sampleService")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
public class SampleServiceImpl implements SampleService {
    @Path("/sayHello/{name}")
    @GET
    public String sayHello(@PathParam(value = "name") String name) {
        return "Hello"+name;
    }
    @Path("/sayHello/{id:\\d+}")
    @GET
    public String test(Integer id) {
        return "hhh"+id;
    }

    //@Path("/getUser")
    //@GET
    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");
        u1.setAge(18);
        u1.setSex('m');

        User u2 = new User();
        u2.setName("rose");
        u2.setAge(18);
        u2.setSex('w');

        User u3 = new User();
        u3.setName("tom");
        u3.setAge(20);
        u3.setSex('m');
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
