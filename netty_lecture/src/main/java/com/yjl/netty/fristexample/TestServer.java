package com.yjl.netty.fristexample;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * 客户端发出请求，服务端返回 Hello World
 */
public class TestServer {

    public static void main(String[] args) throws InterruptedException {
        // 事件循环组  实质上是两个死循环
        // boos Group  接受指令
        EventLoopGroup boosCroup = new NioEventLoopGroup();
        // workerGroup 处理指令  处理完成后返回给 boosGroup
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try{

            // 启动服务端的相关类
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(boosCroup, workerGroup).channel(NioServerSocketChannel.class).childHandler(new TestServerInitializer());
            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            boosCroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }
}
