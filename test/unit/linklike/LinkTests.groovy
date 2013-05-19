package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {

    void testCanCreLink(){
    	def alink = new Link(title: "Google", url: "www.google.com")
    	assert alink != null
    	assertEquals 0, alink.likes
    }
}
