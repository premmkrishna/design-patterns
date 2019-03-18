package com.gangoffour.patterns.behavioral.template;

import org.junit.Assert;
import org.junit.Test;

public class TemplateTest {

    @Test
    public void testScrappyCar() {
        VechicleTemplate vechicleTemplate = new ScrappyCar();
        vechicleTemplate.buildVechicle();
        Assert.assertEquals(79000, vechicleTemplate.getCost());
    }

    @Test
    public void testRollsRoyce() {
        VechicleTemplate vechicleTemplate = new RollsRoycePhantom();
        vechicleTemplate.buildVechicle();
        Assert.assertEquals(736000, vechicleTemplate.getCost());
    }
}
