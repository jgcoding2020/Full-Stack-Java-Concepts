package cogent.infotech.com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatService {

	private HistoryService historyService;
	private ChatRoomService chatRoomService;
	@Autowired
	public ChatService(HistoryService historyService, ChatRoomService chatRoomService) {
		this.historyService = historyService;
		this.chatRoomService = chatRoomService;
	}
	
	public void chat() {
		chatRoomService.start();
		historyService.store();
	}
}
