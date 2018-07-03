package com.poc.jedi.backend.cucumber.stepdefs;

import com.poc.jedi.backend.PocJediBackEndApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PocJediBackEndApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
