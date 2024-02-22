package school.hei.sarisary.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.sarisary.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
