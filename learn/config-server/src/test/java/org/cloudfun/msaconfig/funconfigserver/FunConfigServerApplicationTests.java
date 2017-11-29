package org.cloudfun.msaconfig.funconfigserver;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FunConfigServerApplicationTests {

    MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationConnect;

    @Before
    public void loadResource() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }


    @Test
    public void contextLoads() throws Exception {
        String uri = "/config-server/dev";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
                .andReturn();

//        String content = mvcResult.getResponse().getContentAsString();
        int status = mvcResult.getResponse().getStatus();

        Assert.assertEquals(status, 200);


    }

}
