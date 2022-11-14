package me.alxndr.interfaces.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.alxndr.application.BoardFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BoardController {

	private final BoardFacade boardFacade;

	@GetMapping("/")
	public ResponseEntity index() {
		return ResponseEntity.ok("Hello");
	}

	@GetMapping("/boards")
	public ResponseEntity boards() {
		log.error("controller");
		boardFacade.getBoards();
		return ResponseEntity.ok().build();
	}

}
