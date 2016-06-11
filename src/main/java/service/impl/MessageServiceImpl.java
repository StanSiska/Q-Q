package service.impl;

import java.util.List;

import dao.MessageDAO;
import model.Message;
import service.MessageService;

public class MessageServiceImpl implements MessageService {

	private MessageDAO dao;

	public MessageServiceImpl(MessageDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Message> listAllMessages() {
		return listAllMessages(null);
	}

	@Override
	public List<Message> listAllMessages(Integer groupId) {
		return dao.listAllMessages(groupId);
	}


}