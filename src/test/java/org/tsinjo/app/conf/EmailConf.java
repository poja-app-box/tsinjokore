package org.tsinjo.app.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.tsinjo.app.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
