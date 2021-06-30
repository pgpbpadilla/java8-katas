import com.pgpb.mapper.ObjectMapper;
import com.pgpb.objects.SourceType;
import com.pgpb.objects.TargetType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MapStructTest {
    @Test
    void shouldGenerateGoodMethodNames() {
        SourceType source = new SourceType();
        final TargetType target = ObjectMapper.INSTANCE.map(source);
        assertThat(target).isNotNull();
    }
}
