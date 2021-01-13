package com.iph.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BoardController.class)
public class BoardControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test //home test (미완성)
    public void home_test() throws Exception {
        String home = "home";

        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(home));
    }

    @Test //plan test
    public void plan_test() throws Exception {
        String plan = "plan";

        mvc.perform(get("/plan"))
                .andExpect(status().isOk())
                .andExpect(content().string(plan));
    }

    @Test //add_couple test
    public void add_couple_test() throws Exception {
        String add_couple = "add_couple";

        mvc.perform(get("/add_couple"))
                .andExpect(status().isOk());
               // .andExpect(content().string(add_couple));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
