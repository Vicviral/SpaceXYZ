import SwiftUI
import shared

struct ContentView: View {
	let lastLaunch = APIClient().showLastRocketLaunch()

	var body: some View {
		Text(lastLaunch)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}