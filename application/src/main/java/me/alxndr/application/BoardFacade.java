package me.alxndr.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.alxndr.domain.board.BoardService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BoardFacade {

	private final BoardService boardService;

	public void getBoards() {
		log.debug("board facade");
		boardService.getBoards();
	}

}
