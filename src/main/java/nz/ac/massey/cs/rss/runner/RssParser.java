package nz.ac.massey.cs.rss.runner;

import nz.ac.massey.cs.sdc.parsers.Rss;
import nz.ac.massey.cs.sdc.parsers.RssItem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBElement;
import java.io.File;
import java.util.List;

public class RssParser {
    public static void main(String[] args) {
        try {
            // 创建JAXB上下文
            JAXBContext context = JAXBContext.newInstance(Rss.class);

            // 创建解组器
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // 解析XML文件
            File file = new File("src/main/java/media-technology.xml");
            Rss rss = (Rss) unmarshaller.unmarshal(file);

            // 输出每个项目的标题、描述和链接
            for (RssItem item : rss.getChannel().getItem()) {
                List<Object> elements = item.getTitleOrDescriptionOrLink();
                String title = null, description = null, link = null;

                for (Object element : elements) {
                    if (element instanceof JAXBElement) {
                        JAXBElement<?> jaxbElement = (JAXBElement<?>) element;
                        String localPart = jaxbElement.getName().getLocalPart();

                        switch (localPart) {
                            case "title":
                                title = (String) jaxbElement.getValue();
                                break;
                            case "description":
                                description = (String) jaxbElement.getValue();
                                break;
                            case "link":
                                link = (String) jaxbElement.getValue();
                                break;
                        }
                    }
                }

                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
                System.out.println("Link: " + link);
                System.out.println();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
