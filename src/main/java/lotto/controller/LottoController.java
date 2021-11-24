package lotto.controller;

import lotto.domain.LottoTickets;
import lotto.domain.dto.ResultDto;
import lotto.domain.dto.WinningLottoTicketDto;
import lotto.service.LottoTicketBooth;
import lotto.service.WinningResult;

public class LottoController {

    private static class LottoControllerHolder {
        private static final LottoController LOTTO_CONTROLLER = new LottoController();
    }

    private final WinningResult winningResult;
    private final LottoTicketBooth lottoTicketBooth;

    private LottoController() {
        winningResult = WinningResult.getInstance();
        lottoTicketBooth = LottoTicketBooth.getInstance();
    }

    public static LottoController getInstance() {
        return LottoControllerHolder.LOTTO_CONTROLLER;
    }

    public LottoTickets autoBuyLottoTickets(int money) {
        return lottoTicketBooth.autoTickets(money);
    }

    public ResultDto lottoResult(WinningLottoTicketDto winningLottoTicketDto) {
        return winningResult.winningResult(winningLottoTicketDto);
    }

}
