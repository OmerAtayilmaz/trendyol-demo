package com.trendyol.app.controller;

import com.trendyol.app.dto.SliderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping(value="/api/v1/slider")
public class SliderController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<SliderDto> getSliders(){
        return null;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<SliderDto> createSlider(
            @RequestBody SliderDto sliderDto
    ){
        return null;
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public ResponseEntity<SliderDto> delete(){
        return null;
    }

    @RequestMapping(method=RequestMethod.GET,value="/{title}")
    public ResponseEntity<SliderDto> getByName(
            @PathVariable String title
    ){
        return null;
    }
}
