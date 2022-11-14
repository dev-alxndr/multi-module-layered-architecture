package me.alxndr.infrastructure.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.alxndr.domain.board.BoardWriter;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BoardWriterImpl implements BoardWriter {

	private final BoardRepository boardRepository;

	@Override
	public void saveBoard() {
		log.debug("board Writer");
	}
}
