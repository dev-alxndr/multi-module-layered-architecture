package me.alxndr.infrastructure.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.alxndr.domain.board.BoardReader;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class BoardReaderImpl implements BoardReader {

	private final BoardRepository boardRepository;

	@Override
	public void getBoards() {
		log.debug("Board Reader");
	}
}
