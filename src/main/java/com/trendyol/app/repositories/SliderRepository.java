package com.trendyol.app.repositories;

import com.trendyol.app.entity.Slider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SliderRepository extends JpaRepository<Slider,Long> {


}
