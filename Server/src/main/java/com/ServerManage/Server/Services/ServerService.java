package com.ServerManage.Server.Services;

import com.ServerManage.Server.Models.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws Exception;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
