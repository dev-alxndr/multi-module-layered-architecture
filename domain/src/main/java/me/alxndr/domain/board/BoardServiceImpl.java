package me.alxndr.domain.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardWriter boardWriter;

	private final BoardReader boardReader;

	@Override
	public void getBoards() {
		log.debug("Board Service");
		boardReader.getBoards();
		boardWriter.saveBoard();
	}
}
