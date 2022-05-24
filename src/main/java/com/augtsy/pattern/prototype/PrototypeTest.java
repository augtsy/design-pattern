package com.augtsy.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/5:07 下午
 */
@Slf4j
public class PrototypeTest {

    public static void main(String[] args) {
        Computer computer = new Computer("Score", "16G", "1TB");
        log.info("before simple clone : " + computer);

        Computer computerClone = (Computer) computer.clone();
        log.info("after simple clone : " + computerClone.toString());


        // 深复制
        Disk disk = new Disk(" 208G ", " 2TB");
        ComputerDetail computerDetail = new ComputerDetail(" 12core", " 64G", disk);
        log.info(" before deep clone ：" + computerDetail);

        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        log.info(" after deep clone ：" + computerDetailClone.toString());
    }
}
