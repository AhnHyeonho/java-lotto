package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lotto.domain.result.LottoGameResult;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LottosTest {
    Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6);
    private LottoNumber bonusNumber = new LottoNumber(7);

    @Test
    void 로또_당첨_테스트() {
        List<Lotto> lottoList = new ArrayList<>();
        lottoList.add(new Lotto(1, 2, 3, 7, 8, 9));
        lottoList.add(new Lotto(1, 2, 3, 4, 5, 7));
        lottoList.add(new Lotto(1, 2, 10, 11, 12, 13));

        LottoGameResult lottoGameResult = new LottoGameResult(3000);
        lottoGameResult.addMatchResult(LottoReward.FIFTH);
        lottoGameResult.addMatchResult(LottoReward.SECOND);
        lottoGameResult.addMatchResult(LottoReward.MISS);

        assertThat(new Lottos(lottoList).matchNumbers(new Lotto(numbers), bonusNumber)).isEqualTo(lottoGameResult);
    }
}
