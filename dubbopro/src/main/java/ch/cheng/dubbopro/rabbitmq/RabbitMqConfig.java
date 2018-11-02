package ch.cheng.dubbopro.rabbitmq;



import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-01 17:16
 */
@Configuration
public class RabbitMqConfig {
    
    /**-----------------------此处定义队列和交换器,服务启动后会自动在rabbitmq服务中注册----↓-----------------------**/
    @Bean
    public Queue queue1(){
        return new Queue("chenghao");
    }
    
    @Bean
    public Queue queueMessage(){
        return new Queue("topic.message");
    }
    
    @Bean
    public Queue queueMessages(){
        return new Queue("topic.messages");
    }
    
    
    @Bean
    public Queue AMessage(){
        return new Queue("fanout.A");
    }
    @Bean
    public Queue BMessage(){
        return new Queue("fanout.B");
    }
    @Bean
    public Queue CMessage(){
        return new Queue("fanout.C");
    }
    
    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }
    /**-----------------------此处定义队列和交换器 -----↑-----------------------**/
    
    /**绑定交换器和队列**/
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange){
        //bind后绑定的是队列to后指定交换器exchange
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
    
    @Bean
    Binding bindingExchangeA(Queue AMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(AMessage).to(fanoutExchange);
    }
    
    @Bean
    Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(BMessage).to(fanoutExchange);
    }
    
    @Bean
    Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(CMessage).to(fanoutExchange);
    }
    
}
