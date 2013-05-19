package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
@Mock([Link])
class LinkControllerTests {

    void testCrete(){
    	assertEquals 0, Link.count()
    	params.title = "Apple"
    	params.url = "www.apple.com"
    	controller.create()
    	assertEquals 1, Link.count()
    }

    void testAddLikes(){
    	def alink = new Link(title: "Youtube",url: "www.youtube.com")
    	alink.save()
    	assertEquals 0, alink.likes
    	params.id = alink.id
    	controller.addLikes()
    	assertEquals 1, alink.likes
    }

}
