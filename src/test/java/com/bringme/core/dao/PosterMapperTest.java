package com.bringme.core.dao;

import com.bringme.core.Application;
import com.bringme.core.dto.Poster;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class, initializers = ConfigFileApplicationContextInitializer.class)
public class PosterMapperTest {

    @Autowired
    private PosterMapper posterMapper;

    @Test
    public void findById_validId_returnsData() {
        // Given
        String id = "1";

        // When
        Poster poster = posterMapper.findById(id);

        // Then
        assertThat(poster, notNullValue());
        assertThat(poster.getId(), is("1"));
        assertThat(poster.getName(), is("Martin"));
        assertThat(poster.getSurname(), is("Fowler"));
    }
}