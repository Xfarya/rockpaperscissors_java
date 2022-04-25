package com.example.rps;

import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
class RPSAppTest {

    RPSApp rpsApp = new RPSApp();
    @Spy
    RPSApp rpsAppSpy = spy(RPSApp.class);


}